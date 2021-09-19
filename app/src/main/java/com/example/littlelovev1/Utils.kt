package com.example.littlelovev1

import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser

object Utils {
    val firebaseAuth: FirebaseAuth = FirebaseAuth.getInstance()
    val firebaseUser: FirebaseUser? = firebaseAuth.currentUser
}