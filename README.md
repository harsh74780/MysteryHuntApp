# Mystery Hunt App

An Android application for creating and solving location-based mystery hunts with themed clues.

## Features

- **Custom Location Input**: Enter any location for your mystery hunt
- **Theme Selection**: Choose themes for your clue generation
- **Clue Generation**: Automatically generates clues based on location and theme
- **Push Notifications**: Receive notifications when new clues are available
- **Interactive UI**: Clean, user-friendly interface for hunt participants

## Project Structure

```
MysteryHuntApp/
├── app/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/com/example/mysteryhuntapp/
│   │   │   │   ├── MainActivity.kt      # Entry point with location/theme inputs
│   │   │   │   └── ClueActivity.kt      # Displays clues and manages notifications
│   │   │   ├── res/                     # Resources (layouts, menus, drawables)
│   │   │   └── AndroidManifest.xml      # App configuration
│   │   ├── androidTest/                 # Instrumented tests
│   │   └── test/                        # Unit tests
│   └── build.gradle.kts                 # App-level build configuration
├── build.gradle.kts                     # Project-level build configuration
└── settings.gradle.kts                  # Project settings
```

## Getting Started

### Prerequisites

- Android Studio Arctic Fox or later
- Android SDK API 21 (Lollipop) or higher
- Kotlin 1.5+

### Building the App

1. Clone the repository:
   ```bash
   git clone https://github.com/harsh74780/MysteryHuntApp.git
   ```

2. Open the project in Android Studio

3. Sync Gradle files:
   ```bash
   ./gradlew build
   ```

4. Run the app on an emulator or physical device

### Running Tests

```bash
# Run unit tests
./gradlew test

# Run instrumented tests
./gradlew connectedAndroidTest
```

## Usage

1. **Launch the app** - Open Mystery Hunt App on your Android device
2. **Enter Location** - Type the location for your mystery hunt
3. **Choose Theme** - Enter a theme (e.g., "historical", "nature", "urban")
4. **Start Hunt** - Tap the start button to generate your clue
5. **Receive Notification** - Get a notification with your mystery clue
6. **Solve the Mystery** - Follow the clue to discover the location!

## Permissions

The app requires the following permissions:
- **POST_NOTIFICATIONS** (Android 13+): To send clue notifications

## Technologies Used

- **Language**: Kotlin
- **UI Framework**: Android Views
- **Build System**: Gradle with Kotlin DSL
- **Notifications**: NotificationCompat API
- **Testing**: JUnit, AndroidX Test

## AI Development Assistance

This project supports AI-assisted development through GitHub Copilot. For information about available AI agents and their capabilities, see [AI_AGENTS.md](AI_AGENTS.md).

## Contributing

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/amazing-feature`)
3. Commit your changes (`git commit -m 'Add amazing feature'`)
4. Push to the branch (`git push origin feature/amazing-feature`)
5. Open a Pull Request

## License

This project is for educational purposes.

## Contact

For questions or suggestions, please open an issue on GitHub.
