mst 0
cup 0 init
init:
ssp 5
mst 0
cup 0 main0
hlt
f0:
ssp 6
ldc i 3
ldc i 4
add i
str i 0 5
lod i 0 5
out i
retp
main0:
ssp 6
ldc i 5
ldc i 6
add i
str i 0 5
lod i 0 5
out i
retp
