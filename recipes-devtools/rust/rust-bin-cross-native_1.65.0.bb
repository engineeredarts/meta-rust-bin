RUST_BIN_CROSS_DEPENDS ?= ""
require ${FILE_DIRNAME}/rust-bin-cross_${PV}.bb
#BBCLASSEXTEND+="native"
PROVIDES += "rust-bin-native-${BUILD_ARCH}"
PROVIDES += "rust-bin-cross-${BUILD_ARCH}"
PROVIDES += "rust-bin-cross-${BUILD_ARCH}-native"
PN = "rust-bin-cross-${BUILD_ARCH}-native"
inherit native

