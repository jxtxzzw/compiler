mst 0
cup 0 init
init:
ssp 5
mst 0
cup 0 main0
hlt
main0:
ssp 5
ldc b f
ldc b t
or
out b
ldc b t
ldc b f
or
out b
ldc b t
ldc b t
or
out b
ldc b t
ldc b t
and
out b
ldc b f
ldc b f
or
out b
ldc b f
ldc b t
and
out b
ldc b f
ldc b f
and
out b
ldc b t
ldc b f
and
out b
ldc i 2
ldc i 1
grt i
ldc i 1
ldc i 10
leq i
and
out b
ldc i 2
ldc i 1
les i
ldc i 2
ldc i 10
neq i
or
out b
ldc b f
not
ldc b f
and
ldc b f
ldc b f
not
and
or
out b
ldc b f
not
ldc b t
and
ldc b f
ldc b t
not
and
or
out b
ldc b t
not
ldc b f
and
ldc b t
ldc b f
not
and
or
out b
ldc b t
not
ldc b t
and
ldc b t
ldc b t
not
and
or
out b
ldc b t
not
ldc b t
and
ldc b t
ldc b t
not
and
or
ldc b t
not
ldc b f
and
ldc b t
ldc b f
not
and
or
or
out b
retp
