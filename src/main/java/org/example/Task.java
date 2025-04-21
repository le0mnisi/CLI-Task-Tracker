package org.example;

public class Task {
    int ID;
    String TaskName;
    String Status;

    public Task(){

    }

    public int getID() {
        return ID;
    }

    public String getTaskName() {
        return TaskName;
    }

    public String getStatus() {
        return Status;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setTaskName(String taskName) {
        TaskName = taskName;
    }

    public void setStatus(String status) {
        Status = status;
    }
}
