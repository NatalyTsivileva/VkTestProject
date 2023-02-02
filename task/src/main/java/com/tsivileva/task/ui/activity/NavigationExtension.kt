package com.tsivileva.task.ui.activity

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment

fun AppCompatActivity.replaceFragmentInUi(
	fragmentContainerId: Int,
	tag: String,
	fragment: Fragment,
	needReplace: Boolean
) {
	val isNotAdded = supportFragmentManager.findFragmentByTag(tag) == null

	if (isNotAdded) {
		val transaction = supportFragmentManager.beginTransaction()

		if (needReplace) {
			transaction.replace(fragmentContainerId, fragment, tag).commit()
		} else {
			transaction.add(fragmentContainerId, fragment, tag).commit()
		}
	}
}
