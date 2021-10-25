package com.example.myfirstcrud.data.db

import androidx.room.Database
import com.example.myfirstcrud.data.db.dao.SubscriberDAO
import com.example.myfirstcrud.data.db.entity.SubscriberEntity

@Database(entities = [SubscriberEntity::class], version = 1)
abstract class AppDataBase {

    abstract val subscriberDAO : SubscriberDAO


}