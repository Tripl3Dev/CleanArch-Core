package com.tripl3dev.domain.businessLogic.dataLogic.loginLogic

import com.tripl3dev.domain.Entity.GuestEntity
import com.tripl3dev.domain.repository.base.baseDataRetrieveMechanism.BaseCasheI

interface LoginCacheI : LoginRepositoryI, BaseCasheI {
    fun saveGuestInfo(guest: GuestEntity)
}