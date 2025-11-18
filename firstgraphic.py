import turtle as t
t.speed(1)
t.bgcolor("black")
t.pensize(3)
def func():
    for i in range(200):
        t.right(1)
        t.forward(1)
t.color("red")
t.begin_fill()
t.left(140)
t.forward(111.65)
func()
t.left(120)
func()
t.forward(111.65)
t.end_fill()
t.hideturtle()
t.done()