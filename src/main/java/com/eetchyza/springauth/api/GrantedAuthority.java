package com.eetchyza.springauth.api;

import java.io.Serializable;

public interface GrantedAuthority extends Serializable {
	String getAuthority();
}
