SUMMARY = "cbindgen"
HOMEPAGE = "https://github.com/eqrion/cbindgen"
LICENSE = "MPL"

BBCLASSEXTEND = "native" 
inherit cargo

SRC_URI = "git://github.com/eqrion/cbindgen.git;protocol=https;branch=master"
SRCREV="b6e73017e679caf3b01217e62642d0722a464887"
S = "${WORKDIR}/git"
LIC_FILES_CHKSUM = "file://LICENSE;md5=9741c346eef56131163e13b9db1241b3"
