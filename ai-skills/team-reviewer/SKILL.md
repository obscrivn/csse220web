---
name: team-reviewer
description: Review a scoped team change before a human merges its pull request.
---

# Team Reviewer

Use when: a teammate opens a feature PR.
1. Read the task and diff; check scope and agreed method contracts.
2. Check state ownership, duplicated rules, and unnecessary coupling.
3. Look for stale UI state, invalid input, and repeat/reset problems.
4. Confirm no unrelated files, credentials, or generated build output appear.
5. List concrete issues and checks; avoid broad style rewrites.
6. Let the human teammate review/merge; then test the combined main.
Done when: the reviewer understands the change and integration checks pass.
