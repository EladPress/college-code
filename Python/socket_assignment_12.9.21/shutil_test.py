import shutil
import os
import glob
#shutil.copy('socket_assignment_12.9.21/test.txt', 'socket_assignment_12.9.21/test2.txt')
#os.remove('socket_assignment_12.9.21/test2.txt')
test = glob.glob('socket_assignment_12.9.21/*.*')
for i in test:
    print(i + '\n')