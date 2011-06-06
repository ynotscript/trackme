package com.ynotscript.trackme.api.db.ibatis.dynamic;

public interface PrefixedTableName {
	
	void setPrefix(String prefix);
	String getPrefix();
	
}
