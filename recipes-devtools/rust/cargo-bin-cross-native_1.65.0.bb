require ${FILE_DIRNAME}/cargo-bin-cross_${PV}.bb
#BBCLASSEXTEND+="native"
PROVIDES += "cargo-bin-native-${BUILD_ARCH}"
CARGO_BIN_CROSS_DEPENDS ?= "rust-bin-cross-${TARGET_ARCH}"
PN = "cargo-bin-cross-${BUILD_ARCH}-native"
inherit native
