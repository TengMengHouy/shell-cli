$InstallDir = "$env:USERPROFILE\.local\bin"
New-Item -ItemType Directory -Path $InstallDir -Force | Out-Null

# Download JAR
$JarUrl = "https://github.com/TengMengHouy/shell-cli/releases/download/1.0.1/spring-shell-demo-0.0.1-SNAPSHOT.jar"
$JarPath = "$InstallDir\shell-cli.jar"
Invoke-WebRequest -Uri $JarUrl -OutFile $JarPath

# Create wrapper batch file
$WrapperPath = "$InstallDir\shell-cli.bat"
@"
@echo off
java --enable-native-access=ALL-UNNAMED -jar "%USERPROFILE%\.local\bin\shell-cli.jar" %*
"@ | Out-File -FilePath $WrapperPath -Encoding ASCII

Write-Host "Installed! Add to PATH: $InstallDir"