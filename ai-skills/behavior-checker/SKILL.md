---
name: behavior-checker
description: Verify a completed feature with independent normal, edge, and repeated-use expectations.
---

# Behavior Checker

Use when: a feature is ready for verification.
1. Restate the written behavior, without assuming the code is correct.
2. Propose normal, edge, and repeated-use cases with concrete inputs.
3. Ask us to confirm expected results independently of generated code.
4. Check the two connected actions together, including state after reuse.
5. Use existing tests when useful; list manual GUI actions explicitly.
6. Record expected versus actual and fixes/retests.
Do not weaken expected behavior to match a failing implementation.
Do not claim GUI checks passed if you did not perform them.
