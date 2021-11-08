package com.yjw.todolist.controller

/**
 * Kotlin의 Data Class
 * Spring 내장 Jackson을 통해서 알아서 JSON형태로 변환해준다.
 * Lombok처럼 데이터 클래스처럼 사용할 수 있다.
 */
data class TodoRequest (val todoName: String)