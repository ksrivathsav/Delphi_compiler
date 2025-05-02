program LoopTest;

var
  x: integer;

begin
  x := 3;
  while x > 0 do
  begin
    if x = 2 then
      print(100);
    else
      print(x);
    x := x - 1;
  end
end.
