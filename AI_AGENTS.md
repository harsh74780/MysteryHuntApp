# GitHub Copilot AI Agents

This document describes the AI agents available in this repository through GitHub Copilot Workspace.

## Available AI Agents

### 1. **GitHub Copilot Coding Agent** (Primary Agent)
The main coding agent you're currently interacting with. This agent has the following capabilities:

#### Core Capabilities:
- **Code Analysis & Understanding**: Read and analyze code across multiple files
- **Code Generation**: Write new code, functions, classes, and entire files
- **Code Modification**: Make surgical, minimal changes to existing code
- **Refactoring**: Improve code structure while maintaining functionality
- **Bug Fixing**: Identify and fix bugs in the codebase
- **Testing**: Create and run tests (unit tests, integration tests)
- **Documentation**: Write and update documentation

#### Development Tools Access:
- **Git Operations**: View repository history, branches, commits, and diffs
- **Build Systems**: Run Gradle, Maven, npm, pip and other build tools
- **Linters**: Run code quality and style checkers
- **Test Runners**: Execute test suites and analyze results
- **Package Managers**: Install and manage dependencies
- **Bash/Shell**: Execute command-line operations

#### GitHub Integration:
- **Repository Access**: Read files, directories, and repository structure
- **Pull Requests**: Create and update PR descriptions, commit changes
- **Issues**: Read issue descriptions and comments
- **Search**: Search across code, issues, and pull requests
- **Workflow Analysis**: Analyze GitHub Actions workflows and logs

### 2. **Language-Specific Capabilities**

#### For This Repository (Kotlin/Android):
- Android app development and debugging
- Kotlin syntax and best practices
- Gradle build configuration
- Android SDK and API usage
- Layout XML and resource management
- Manifest configuration

### 3. **Specialized Agents** (Context-Dependent)

While working on specific tasks, you may have access to:

#### Browser Agent (Playwright)
- **Web Automation**: Navigate websites and interact with web pages
- **UI Testing**: Test web interfaces
- **Screenshots**: Capture webpage screenshots
- **Form Filling**: Automate form submissions
- **Network Monitoring**: Track network requests

#### Search Agents
- **Code Search**: Find specific code patterns across GitHub
- **Issue Search**: Find related issues and discussions
- **PR Search**: Locate relevant pull requests
- **User Search**: Find GitHub users and contributors

## How to Use These Agents

### Basic Workflow:
1. **Exploration**: Ask the agent to explore the repository structure
2. **Analysis**: Request code analysis or bug investigation
3. **Planning**: The agent will create a plan as a checklist
4. **Implementation**: The agent makes minimal, focused changes
5. **Testing**: The agent runs tests to validate changes
6. **Progress Reporting**: Regular updates on work completed

### Example Commands:
- "Fix the bug in ClueActivity.kt"
- "Add a new feature to generate random clues"
- "Refactor the notification code to be more maintainable"
- "Write tests for the MainActivity"
- "Update the documentation to explain the app architecture"
- "Search for similar notification implementations in other repositories"

## Agent Limitations

The agents **cannot**:
- Access arbitrary websites (limited internet access)
- Make changes to other repositories
- Force push or rewrite git history
- Access `.github/agents` directory (contains internal agent configs)
- Commit secrets or sensitive data
- Execute privileged system operations

The agents **can**:
- Read all files in this repository (except `.github/agents`)
- Make changes and commit to the current branch
- Run builds, tests, and linters
- Install packages and dependencies
- Search across GitHub public repositories
- Create comprehensive documentation

## Best Practices

1. **Be Specific**: Clearly describe what you want to achieve
2. **Provide Context**: Reference specific files, functions, or issues
3. **Incremental Changes**: Request small, focused changes
4. **Validate Often**: Ask the agent to test changes frequently
5. **Review Progress**: Check the PR updates after each commit

## Current Repository Context

- **Repository**: harsh74780/MysteryHuntApp
- **Type**: Android application (Kotlin)
- **Build System**: Gradle
- **Main Components**: 
  - MainActivity.kt - Entry point with location/theme inputs
  - ClueActivity.kt - Displays clues and sends notifications
  
## Need Help?

Ask the agent questions like:
- "What files are in this repository?"
- "Explain what this code does"
- "How can I add a new feature?"
- "What tests exist in this project?"
- "How do I build this Android app?"

The agent will analyze your request and provide detailed assistance!
