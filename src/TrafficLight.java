public enum TrafficLight{
		RED(1), GREEN(1), ORANGE(1);
		
		private final int value;
		TrafficLight(int v){
			value = v;
		}
		public int getValue(){
			return value;
		}

	}