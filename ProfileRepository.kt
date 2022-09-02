package com.example.budgetapp.repositories

import com.example.budgetapp.db.ProfileDao
import com.example.budgetapp.entities.Profile
import javax.inject.Inject

class ProfileRepository @Inject constructor(
    val profileDao: ProfileDao
) {

    fun getProfile() = profileDao.getProfileData()

    suspend fun insertProfileDate(profile: Profile) = profileDao.insertProfileData(profile)
}