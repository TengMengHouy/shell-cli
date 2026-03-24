### shell-cli

A Spring Shell CLI application. Built with Spring Boot 4.0.4 and Spring Shell 4.0.1.

#### Features

- Interactive command-line interface powered by Spring Shell
- Java 17+ support
- Fast startup with minimal logging
- Easy installation via one-liner command

#### Installation

##### Quick Install (macOS/Linux/WSL)

```bash
curl -fsSL https://github.com/TengMengHouy/shell-cli/raw/main/install.sh | bash
shell-cli
```


#### Windows installation and usage


Step 1 — Open PowerShell
1. Press Win + X
2. Select "Windows PowerShell" (or "Windows Terminal")

Step 2 — Run the install command
Run this in PowerShell (downloads and runs installer):

```powershell
irm https://github.com/TengMengHouy/shell-cli/raw/main/install.ps1 | iex
```

Notes:
- `irm` = Invoke-RestMethod (downloads the script)
- `iex` = Invoke-Expression (executes it)

What the installer does:
- Creates: `%USERPROFILE%\.local\bin`
- Downloads JAR to: `%USERPROFILE%\.local\bin\shell-cli.jar`
- Creates wrapper: `%USERPROFILE%\.local\bin\shell-cli.bat` that runs:
  `java --enable-native-access=ALL-UNNAMED -jar "%USERPROFILE%\.local\bin\shell-cli.jar" %*`

Step 3 — Add to PATH
1. Press Win + X → System
2. Click "Advanced system settings"
3. Click "Environment Variables"
4. Under "User variables", click "New"
    - Name: `PATH`
    - Value: `%USERPROFILE%\.local\bin`
5. Click "OK" three times
6. Restart PowerShell

Step 4 — Run the CLI
In PowerShell run:

```powershell
shell-cli
```

Notes
- Ensure a compatible Java runtime is installed.