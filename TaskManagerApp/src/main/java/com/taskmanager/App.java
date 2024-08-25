package com.taskmanager;

public class App {
    public static void main( String[] args ){
        Task task = new Task("Aprendiendo Java", "Para mejorar mis conocimientos en Java creare el proyecto 'Task Manager'");
    System.out.println(task);
    task.setComplete(true);
    System.out.println("Despues de completar la tarea: "); 
    System.out.println(task);  
    }
}
