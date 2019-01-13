package com.welearn.listinterface;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BeanInvoker {
	
	@Autowired
	@Qualifier("inuse")
	private List<OneInterface> oneInterfaces;
	
	public void showBeans()
	{
		for(OneInterface oneInterface : oneInterfaces)
		{
			oneInterface.say();
		}
	}

}
