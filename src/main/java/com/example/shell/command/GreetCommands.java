package com.example.shell.command;

import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;

/**
 * Basic greeting commands — Spring Shell 3.4.2 style.
 *
 * <p>In Spring Shell 3.x the classic annotation set is still fully supported:
 * <ul>
 *   <li>@ShellComponent — marks this bean as a command provider (specialised @Component)</li>
 *   <li>@ShellMethod  — exposes a public method as a shell command</li>
 *   <li>@ShellOption  — configures a method parameter (default value, help text, arity)</li>
 * </ul>
 *
 * <p>All annotations live in: org.springframework.shell.standard
 */
@ShellComponent
public class GreetCommands {

    /**
     * Greet a user by name.
     *
     * Usage: greet --name Alice
     *        greet              (uses default "World")
     */
    @ShellMethod(key = "greet", value = "Greet someone by name")
    public String greet(
            @ShellOption(defaultValue = "World", help = "The name to greet") String name) {
        return "Hello, " + name + "!";
    }

    /**
     * Echo a message back to the shell.
     *
     * Usage: echo --message "Hello there"
     */
    @ShellMethod(key = "echo", value = "Echo a message back to the terminal")
    public String echo(
            @ShellOption(help = "The message to echo") String message) {
        return "Echo: " + message;
    }

    /**
     * Add two integers.
     *
     * Usage: add --a 5 --b 3
     */
    @ShellMethod(key = "add", value = "Add two integers together")
    public String add(int a, int b) {
        return a + " + " + b + " = " + (a + b);
    }

    /**
     * Convert a string to uppercase or lowercase.
     *
     * Usage: transform --text hello --upper
     *        transform --text HELLO          (default: lowercase)
     */
    @ShellMethod(key = "transform", value = "Transform text to upper or lower case")
    public String transform(
            @ShellOption(help = "The text to transform") String text,
            @ShellOption(defaultValue = "false", help = "Pass --upper to uppercase") boolean upper) {
        return upper ? text.toUpperCase() : text.toLowerCase();
    }
}