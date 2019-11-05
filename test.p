mst 0
cup 0 init
init:
ssp 5
mst 0
cup 0 main0
hlt
main0:
ssp 7
ldc i 1
out i
ldc c '\n'
out c
ldc i 1
neg i
out i
ldc c '\n'
out c
ldc r 1.1
out r
ldc c '\n'
out c
ldc r 1.1
neg r
out r
ldc c '\n'
out c
ldc i 2
str i 0 5
lod i 0 5
neg i
str i 0 5
lod i 0 5
out i
ldc c '\n'
out c
ldc i 0
out i
ldc c '\n'
out c
ldc i 0
neg i
out i
ldc c '\n'
out c
ldc i 2
ldc i 2
neg i
add i
str i 0 6
lod i 0 6
out i
ldc c '\n'
out c
ldc i 2
neg i
ldc i 3
neg i
sub i
str i 0 6
lod i 0 6
out i
ldc c '\n'
out c
ldc i 2
neg i
ldc i 3
sub i
out i
ldc c '\n'
out c
ldc i 2
neg i
ldc i 3
sub i
out i
ldc c '\n'
out c
retp
