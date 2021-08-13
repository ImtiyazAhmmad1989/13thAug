def m1(parent,myJenkinsParam){

	
	
	println "Hello from m1()!!!!!!!!!!!!!!"
	
	//println myJenkinsParam;
	
	for (p in myJenkinsParam){
	String keyVal= p.split(":");
		
		for(kv in keyVal)
		{
		parent.myJenkinsMap.put(kv,1);
		}
	}
	
	
	println parent.myJenkinsMap;

}

def call(){

println "Hello from m2()!!!!!!!!!!!!!!!!"

}
