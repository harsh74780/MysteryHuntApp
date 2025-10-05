# AI Agents Quick Reference

## 🤖 Available AI Agents

| Agent Type | Primary Use | Key Capabilities |
|------------|-------------|------------------|
| **Coding Agent** | Main development assistant | Code generation, bug fixing, refactoring, testing |
| **Browser Agent** | Web automation | UI testing, screenshots, form filling |
| **Search Agents** | Finding resources | Search code, issues, PRs across GitHub |

## 🚀 Quick Commands

### Code Operations
```
"Show me the files in this repository"
"Explain what MainActivity.kt does"
"Fix the bug in [filename]"
"Add a new feature to [component]"
"Refactor [function/class] to improve readability"
```

### Testing
```
"Write unit tests for [class/function]"
"Run the existing tests"
"Add integration tests for [feature]"
```

### Documentation
```
"Document the [function/class]"
"Update README with [information]"
"Explain the architecture of this app"
```

### Search & Discovery
```
"Search for similar implementations of [feature]"
"Find examples of [pattern] in other repositories"
"Look up issues related to [topic]"
```

## ⚙️ What the Agent Can Do

✅ Read & analyze all repository files  
✅ Write and modify code  
✅ Run builds, tests, and linters  
✅ Install dependencies  
✅ Commit changes to the current branch  
✅ Search across GitHub  
✅ Create documentation  
✅ Execute bash commands  

## 🚫 What the Agent Cannot Do

❌ Access arbitrary websites  
❌ Modify other repositories  
❌ Force push changes  
❌ Expose secrets or credentials  
❌ Access `.github/agents` directory  

## 💡 Best Practices

1. **Be Specific** - "Fix notification bug in ClueActivity" vs "Fix bug"
2. **Provide Context** - Reference specific files, lines, or functions
3. **Request Small Changes** - Incremental improvements are better
4. **Validate Changes** - Ask to run tests after modifications
5. **Review Progress** - Check commits and PR updates

## 📱 Repository-Specific Context

**Project**: Mystery Hunt App (Android/Kotlin)  
**Build**: Gradle  
**Key Files**:
- `MainActivity.kt` - Entry point with user inputs
- `ClueActivity.kt` - Clue display and notifications

## 📚 Full Documentation

- Detailed agent capabilities → [AI_AGENTS.md](AI_AGENTS.md)
- Project overview → [README.md](README.md)

---

**Tip**: Start with "What can you help me with?" to get personalized assistance!
