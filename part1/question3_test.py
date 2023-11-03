from question3 import make_oven, alchemy_combine
def test_alchemy_combine():
  oven = make_oven()
  assert alchemy_combine(
    oven,
    ["lead", "mercury"],
    5000
  ) == oven.get_output()

  assert alchemy_combine(
    oven,
    ["water", "air"],
    -100
  ) == oven.get_output()

  assert alchemy_combine(
    oven,
    ["cheese", "dough", "tomato"],
    150
  ) == oven.get_output()
