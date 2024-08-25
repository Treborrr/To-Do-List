package com.taskmanager;

import java.util.ArrayList; // Es una estructura de datos que se usara para lamacenar las task.

public class TaskManager {
    private arrayList<> tasks;
    public TaskManager(){
        tasks = new ArrayList<>();
    }
    public void addTask(Task task){ // Metodo para agregar una tarea.
        tasks.add(task); // Agrega la tarea al ArrayList, al final de la lista.
        System.out.println("Tarea agregada: " + task.getName());
    }
    public void listTasks(){ // Metodo para listar las tareas.
        System.out.println("Lista de tareas: ");
        for(Task task : tasks){ // for-each loop, recorre la lista de tareas.
            System.out.println(task);
        }
    }
    public void completeTask(int index) {
        if (index >= 0 && index < tasks.size()) { // Verificamos que el indice este dentro del rango de la lista
            tasks.get(index).setCompleted(true); // Marcamos la tarea como completada
            System.out.println("Tarea completada: " + tasks.get(index).getName()); // Informamos que la tarea ha sido completada
        } else {
            System.out.println("Número de tarea inválido."); // Informamos si el índice proporcionado es inválido
        }
    }
    public void removeTask(int index) {
        if (index >= 0 && index < tasks.size()) {
            System.out.println("Tarea eliminada: " + tasks.get(index).getName()); // Informamos que la tarea ha sido eliminada
            tasks.remove(index); // Eliminamos la tarea de la lista
        } else {
            System.out.println("Número de tarea inválido."); // Informamos si el indice proporcionado es invalido
        }
    }
}