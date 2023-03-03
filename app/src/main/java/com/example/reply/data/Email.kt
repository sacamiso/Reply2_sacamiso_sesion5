package com.example.reply.data

data class Email(
    val id: Int,
    val sender: Account,
    val recipients: List<Account> = emptyList(),
    val subject: String = "",
    val body: String = "",
    var mailbox: MailboxType = MailboxType.Inbox,
    var createdAt: String
)
