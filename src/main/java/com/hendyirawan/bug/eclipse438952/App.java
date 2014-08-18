package com.hendyirawan.bug.eclipse438952;

import java.util.concurrent.Executors;
import java.util.function.Supplier;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	executors = Executors.newSingleThreadExecutor();
		Supplier<Object> m6 = App::new;
		m6 = () -> new App() {
			void test() {
                // <Ctrl+Space>
			}
		};
    }
}
