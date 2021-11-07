package com.yjw.todolist.repository

import org.hibernate.annotations.ColumnDefault
import javax.persistence.*

/**
 * Entity
 * var id : 변수 id
 * var id : Long? = null : 타입은 Long 타입이고 기본 값은 null
 * 변수에 ?를 붙으면 null이 들어갈 수 있다는 뜻.
 */
@Entity
class Todo(

        /**
         * 컬럼들은 생성자를 통해서 만들어줘야함
         * 로직이 따로 없다면 {}를 지워도 된다.
         * 자동 증가 값 IDENTITY : MySQL의 AutoIncrement
         * strategy : 전략
         * @Id는 PK로 사용하겠다는 뜻.
         */
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        var id: Long? = null,

        @Column(nullable = false)
        @ColumnDefault("false")//컬럼의 기본 값
        var completed: Boolean = false,

        @Column(nullable = false)
        var todoName : String
)