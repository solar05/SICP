checks: lint check-kibit kondo
lint:
	lein cljfmt check
fix:
	lein cljfmt fix
check-kibit:
	lein kibit
kondo:
	clj-kondo --lint src --config .clj-kondo/config.edn
test:
	bin/kaocha
.PHONY: test
