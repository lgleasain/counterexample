package com.example.counterapplication

import com.instacart.formula.Evaluation
import com.instacart.formula.Formula
import com.instacart.formula.FormulaContext

class CounterFormula : Formula<Unit, CounterState, CounterRenderModel> {

  override fun initialState(input: Unit): CounterState = CounterState(count = 0)

  override fun evaluate(
    input: Unit,
    state: CounterState,
    context: FormulaContext<CounterState>
  ): Evaluation<CounterRenderModel> {
    val count = state.count
    return Evaluation(
      output = CounterRenderModel(
        count = "Count: $count",
        onDecrement = context.callback {
          transition(state.copy(count = count - 1))
        },
        onIncrement = context.callback {
          transition(state.copy(count = count + 1))
        }
      )
    )
  }
}