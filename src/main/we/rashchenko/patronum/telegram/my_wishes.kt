package we.rashchenko.patronum.telegram

import com.github.kotlintelegrambot.Bot
import we.rashchenko.patronum.database.Database


fun Bot.Builder.myWishes(database: Database, telegramUserId: Long): MainState {
    return MainState.MENU
}