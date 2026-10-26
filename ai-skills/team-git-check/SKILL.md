---
name: team-git-check
description: Inspect a student team repository and coach authorized pull, push, and merge steps while preserving teammates' work.
---

# Team Git Check

1. Begin read-only: identify repository root, branch, working-tree changes,
   remotes, upstream tracking, and any unfinished merge. Distinguish local
   tracking information from current remote information until fetch succeeds.
2. Explain commit (local snapshot), fetch (remote information), pull (integrate
   upstream into the current branch), push (upload commits), and merge direction.
3. Ask which phase the student wants. Inspect and explain the proposed action
   before changing branches, committing, pulling, pushing, or merging.
4. Preserve uncommitted changes. Have the student review/save intentional work;
   do not auto-stash, discard, reset, delete branches, force-push, or rewrite history.
5. For clean main, fetch and use a fast-forward-only pull from its verified
   upstream. If histories diverge, stop and explain; do not improvise a reset.
6. Push only the named feature branch with the student's explicit instruction.
   Check its upstream and summarize commits first. Never push directly to main.
7. To update a feature: with a clean tree, merge verified updated main INTO the
   feature branch. Explain conflicts using both changes and the intended behavior.
   Do not blindly choose ours/theirs. Let humans confirm uncertain intent.
8. Feature INTO main happens through a human-reviewed PR on GitHub. Do not
   merge the PR automatically. Guide the GitHub Desktop fallback when useful.
9. Verify status, source changes, and agreed checks after integration. Report
   Git checks separately from GUI checks the student must perform.
10. On missing authentication/network access or uncertain repository state,
    stop and explain the next action; never request secrets in chat.
