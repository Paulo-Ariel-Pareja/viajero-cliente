package com.adndevelopersoftware.viajerocliente.providers

import android.util.Log
import com.google.android.gms.tasks.Task
import com.google.firebase.firestore.DocumentSnapshot
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase

class ConfigProvider {
    val db = Firebase.firestore.collection("Config")

    fun getPrice(): Task<DocumentSnapshot>{
        return db.document("prices").get().addOnFailureListener { e ->
            Log.d("FIREBASE", "Error: ${e.message}")
        }
    }
}