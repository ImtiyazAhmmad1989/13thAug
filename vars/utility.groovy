def m1(parent,myJenkinsParam){

	
	
	println "Hello from m1()!!!!!!!!!!!!!!"
	
	//println myJenkinsParam;
	
	for (p in myJenkinsParam){
	String keyVal= p.split(":");
		
		
		parent.myJenkinsMap.put(keyVal[0],1);
		
	}
	
	
	println parent.myJenkinsMap;

}

def call(){

println "Hello from m2()!!!!!!!!!!!!!!!!"

}
