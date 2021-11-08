package com.yjw.todolist.service

import com.yjw.todolist.repository.Todo
import com.yjw.todolist.repository.TodoRepository
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service

@Service
class TodoService(
    private val todoRepository: TodoRepository
) {
    fun getTodos() = todoRepository.findAll()

    /**
     * TodoClass(todoname=todoname) : Todo객체를 만들어서 넘기고 만든
     *                           Todo객체의 todoName = 파라미터todoName
     */
    fun insertTodo(todoName : String) = todoRepository.save(Todo(todoName = todoName))


    /**
     * findByIdOrNull : todoId를 가진 데이터가 있을 때 가져오고, 없을 경우 null을 가져옴
     * findByIdOrNull을 사용할 경우 Null일 경우의 Exception 처리를 해줘야 후처리 로직에 영향없음
     */
    fun updateTodo(todoId: Long): Todo{
        val todo = todoRepository.findByIdOrNull(todoId) ?: throw  Exception()
        todo.completed = !todo.completed
        return todoRepository.save(todo)
    }

    fun deleteTodo(todoId: Long) = todoRepository.deleteById(todoId)
}