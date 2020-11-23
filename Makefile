viztest:
	# clojure -m hodur-visualizer-schema.main hello.core
	clojure -m bare.build bare.core

clean:
	rm -rf target