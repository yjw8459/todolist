package com.yjw.todolist.repository

import org.springframework.data.repository.CrudRepository

/**
 * TodoRepository는 CrudRepository를 상속
 * CrudRepository : Todo클래스 사용, Key타입은 Long
 */
interface TodoRepository : CrudRepository<Todo, Long>