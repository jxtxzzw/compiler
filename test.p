mst 0
cup 0 init
init:
ssp 5
mst 0
cup 0 main0
hlt
main0:
ssp 5
ldc r 1.1
ldc r 2.2
add r
out r
ldc c '\n'
out c
ldc r 3.0
ldc r 1.1
mul r
out r
ldc c '\n'
out c
retp
