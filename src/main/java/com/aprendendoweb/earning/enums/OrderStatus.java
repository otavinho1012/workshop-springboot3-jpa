package com.aprendendoweb.earning.enums;

public enum OrderStatus {
		WAITING_PAYMENT(1),
		PAID(2),
		SHIPPED(3),
		DELIVERED(4),
		CANCELED(5);
	
		private int code;
		
		private OrderStatus(int code){
			this.code = code;
		}
		
		public int getCode() {
			return code;
		}
		
		
		// método para converter um numero em um tipo enumerado
		//Percorrendo o OrderStatus
	
		public static OrderStatus valueOf(int code) {
			for(OrderStatus value : OrderStatus.values()){
				if(value.getCode() == code) {
					return value;
				}
			}
			throw new IllegalArgumentException("Invalid OrderStatus code");
		}
}
