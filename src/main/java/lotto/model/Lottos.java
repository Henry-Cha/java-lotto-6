package lotto.model;

import lotto.util.RandomGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Lottos {
    private final List<Lotto> lottos;
    public Lottos(){
        lottos = new ArrayList<>();
    }
    public void buyOneAllRandom(){
        lottos.add(new Lotto(RandomGenerator.getAutoNumbers(6)));
    }
    public void buyMultipleAllRandom(int payment){
        int count = payment / 1000;
        IntStream.range(0,count)
                .mapToObj(lotto->new Lotto(RandomGenerator.getAutoNumbers(6)))
                .forEach(lottos::add);
    }
    public int getSize(){
        return lottos.size();
    }
    public List<Lotto> getLottos(){
        return lottos;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        lottos.forEach(lotto -> sb.append(lotto).append('\n'));
        return sb.toString();
    }
}
