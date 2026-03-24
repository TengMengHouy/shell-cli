#!/bin/bash
INSTALL_DIR="$HOME/.local/bin"
mkdir -p "$INSTALL_DIR"

# Download JAR
curl -fsSL https://github.com/TengMengHouy/shell-cli/releases/latest/download/shell-cli.jar -o "$INSTALL_DIR/shell-cli.jar"

# Create wrapper
cat > "$INSTALL_DIR/shell-cli" << 'EOF'
#!/bin/bash
java -jar "$HOME/.local/bin/shell-cli.jar" "$@"
EOF

chmod +x "$INSTALL_DIR/shell-cli"
echo "Installed! Add to PATH: export PATH=\"\$HOME/.local/bin:\$PATH\""