# java \
	# -XX:+PrintGCDetails \
	# -XX:+PrintGCTimeStamps \
	# -XX:+PrintGCDateStamps \
	# -XX:+PrintTenuringDistribution \
	# -XX:+PrintGCApplicationStoppedTime \
java \
	-Xmx4096m \
	-Xms2048m \
        -Xint \
	-cp ./time-complexity-analyser/target/time-complexity-analyser-1.0-SNAPSHOT-fat.jar \
        tech.dario.timecomplexityanalysis.analyser.SpeedAndAccuracyTest
