package com.bjsxt.mediator;

public class Market implements Department{

	private Mediator m;        //持有中介者(总经理)的应用
	
	
	public Market(Mediator m) {
		super();
		this.m = m;
		m.register("market", this);
	}
	@Override
	public void outAction() {
		System.out.println("汇报工作！项目承接的进度，需要资金支持！");
		m.command("financial");
		
	}
	@Override
	public void selfAction() {
		System.out.println("跑去接项目！");

	}
}
