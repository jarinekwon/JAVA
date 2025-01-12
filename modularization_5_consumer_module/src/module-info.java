module com.in28minutes.consumer {
	requires com.in28minutes.service.provider;
//	requires java.logging;
	requires transitive java.logging; //모두에게 접근권한 부여
}