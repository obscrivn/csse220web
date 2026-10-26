// CSSE220 Coding Skills Hub: copy buttons for AI coaching prompts.
// Without JavaScript the prompt text is still visible and selectable.
document.querySelectorAll('.prompt-box').forEach(function (box) {
  var pre = box.querySelector('pre');
  if (!pre) return;
  var label = box.getAttribute('data-copy-label') || 'Copy prompt';
  var button = document.createElement('button');
  button.type = 'button';
  button.className = 'copy-btn';
  button.textContent = label;
  button.addEventListener('click', function () {
    var text = pre.innerText;
    var done = function () {
      button.textContent = 'Copied';
      setTimeout(function () { button.textContent = label; }, 1600);
    };
    if (navigator.clipboard && navigator.clipboard.writeText) {
      navigator.clipboard.writeText(text).then(done, function () { fallback(text); done(); });
    } else {
      fallback(text);
      done();
    }
  });
  box.insertBefore(button, pre);
});

function fallback(text) {
  var area = document.createElement('textarea');
  area.value = text;
  area.setAttribute('readonly', '');
  area.style.position = 'absolute';
  area.style.left = '-9999px';
  document.body.appendChild(area);
  area.select();
  try { document.execCommand('copy'); } catch (e) { /* user can still select the text */ }
  document.body.removeChild(area);
}
