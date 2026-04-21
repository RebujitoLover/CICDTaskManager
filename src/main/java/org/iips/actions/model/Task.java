package org.iips.actions.model;

import java.time.LocalDate;
import java.util.UUID;

/**
 * Represents a task in the task manager.
 *
 * @param id Unique identifier for the task
 * @param description Task description (not blank)
 * @param completed Whether the task is completed
 * @param dueDate Due date for the task (optional)
 */
public record Task(UUID id, String description, boolean completed, LocalDate dueDate) {
  public Task {
    if (id == null) {
      throw new IllegalArgumentException("Task id cannot be null");
    }
    if (description == null || description.isBlank()) {
      throw new IllegalArgumentException("Task description cannot be null or blank");
    }
    // dueDate can be null (optional)
  }
}
