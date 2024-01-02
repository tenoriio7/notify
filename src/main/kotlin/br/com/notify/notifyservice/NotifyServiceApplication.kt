package br.com.notify.notifyservice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class NotifyServiceApplication

fun main(args: Array<String>) {
	runApplication<NotifyServiceApplication>(*args)
}
