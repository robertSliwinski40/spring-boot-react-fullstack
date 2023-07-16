package com.amigoscode.demo

import com.amigoscode.demo.notification.NotificationEvent


fun main() {
    val event = NotificationEvent("Notification received event")
    print(event.event)


}
