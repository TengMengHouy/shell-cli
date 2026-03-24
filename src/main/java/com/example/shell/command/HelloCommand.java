package com.example.shell.command;

import org.springframework.shell.command.annotation.Command;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

@ShellComponent
public class HelloCommand {
    @ShellMethod
    public String example() {
        return "Hello";
    }
}
